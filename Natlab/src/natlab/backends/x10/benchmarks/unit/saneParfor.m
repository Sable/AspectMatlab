function [] = saneParfor(v)
d = v; x=0;
A=zeros(1,10);
%!parfor
for i = 1:10
   x = x+i;
   d = i*2;
   A(i) = d;
end
end
